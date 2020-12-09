package sample.dal.file;

import sample.be.Song;

import java.io.IOException;
import java.sql.*;

public class SongDAO {

    private final JDBCConnectionPool connectionPool;

    public SongDAO() throws IOException
    {
        connectionPool = JDBCConnectionPool.getInstance();
    }


    public Song createSong(String title, String artist, float time) throws SQLException
    {
        String sql = "INSERT INTO Song (title, artist, time) VALUES(?,?,?);";
        Connection con = connectionPool.checkOut(); // <<< Using the object pool here <<<
        try (PreparedStatement st = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS))
        {
            st.setString(1, title);
            st.setString(2, artist);
            st.setFloat(3, time);
            st.executeUpdate();
            ResultSet rs = st.getGeneratedKeys();
            int id = 0;
            if (rs.next())
            {
                id = rs.getInt(1);
            }
            Song song = new Song(title,artist,id,time);
            return song;
        } catch (SQLException ex)
        {
            throw new SQLException("Could not create Song", ex);
        } finally
        {
            connectionPool.checkIn(con);// <<< Using the object pool here <<<
        }
    }
}
