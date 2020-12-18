package sample.dal;

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

    public List<Song> getAllSongs() throws IOException {

        ArrayList<Song> allSongs = new ArrayList<>();

        try (Connection connection = connectionPool.checkOut()) {
            String sql = "SELECT * FROM Song;";
            Statement statement = connection.createStatement();
            if (statement.execute(sql)) {
                ResultSet resultSet = statement.getResultSet();
                while (resultSet.next()) {
                    int id = resultSet.getInt("id");
                    String title = resultSet.getString("title");
                    String artist = resultSet.getString("artist");
                    int duration = resultSet.getInt("duration");
                    String url = resultSet.getString("url");
                    Song song = new Song(id, title, artist, duration, url);
                    allSongs.add(song);
                }
            }
        } catch (SQLException throwable) {
            throwable.printStackTrace();
        }
        return allSongs;
    }

    public Song createSong(String title, String artist, int duration, String url) throws SQLException {
        String sql = "INSERT INTO Song (title, artist, duration, url) VALUES(?,?,?,?);";
        Connection con = connectionPool.checkOut(); // <<< Using the object pool here <<<
        try (PreparedStatement st = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS))
        {
            st.setString(1, title);
            st.setString(2, artist);
            st.setInt(3, duration);
            st.setString(4, url);
            st.executeUpdate();
            ResultSet rs = st.getGeneratedKeys();
            int id = 0;
            if (rs.next())
            {
                id = rs.getInt(1);
            }


            Song song = new Song(id, title, artist, duration, url);

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
