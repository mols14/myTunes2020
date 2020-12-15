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


<<<<<<< Updated upstream
    public Song createSong(String title, String artist, float time) throws SQLException
=======
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
                    Song song = new Song(id, title, artist, duration, url);
                    allSongs.add(song);
                }
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return allSongs;
    }
    public Song createSong(String title, String artist, float duration, String url) throws SQLException
>>>>>>> Stashed changes
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
<<<<<<< Updated upstream
            Song song = new Song(title,artist,id,time);
=======
            Song song = new Song(id, title, artist, duration, url);
>>>>>>> Stashed changes
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
