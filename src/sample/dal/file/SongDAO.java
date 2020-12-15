package sample.dal.file;

import sample.be.Song;

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SongDAO {

    private final JDBCConnectionPool connectionPool;

    public SongDAO() throws IOException
    {
        connectionPool = JDBCConnectionPool.getInstance();
    }

    public List<Song> getAllSongs() throws IOException{

        ArrayList<Song> allSongs = new ArrayList<>();

        try (Connection connection = connectionPool.checkOut()) {
            String sql = "INSERT INTO Song (title, artist, duration, url) VALUES(?,?,?,?);";
            Statement statement = connection.createStatement();
            if (statement.execute(sql)) {
                ResultSet resultSet = statement.getResultSet();
                while(resultSet.next()) {
                    int id = resultSet.getInt("id");
                    String title = resultSet.getString("title");
                    String artist = resultSet.getString("artist");
                    int duration = resultSet.getInt("duration");
                    String url = resultSet.getString("path");
                }
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
    public Song createSong(String title, String artist, float duration, String url) throws SQLException
    {
        String sql = "INSERT INTO Song (title, artist, time, url) VALUES(?,?,?,?);";
        Connection con = connectionPool.checkOut(); // <<< Using the object pool here <<<
        try (PreparedStatement st = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS))
        {
            st.setString(1, title);
            st.setString(2, artist);
            st.setFloat(3, duration);
            st.setString(4, url);
            st.executeUpdate();
            ResultSet rs = st.getGeneratedKeys();
            int id = 0;
            if (rs.next())
            {
                id = rs.getInt(1);
            }
            Song song = new Song(title,artist,id,duration);
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
