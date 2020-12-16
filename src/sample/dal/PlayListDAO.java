package sample.dal;

import javafx.beans.Observable;
import javafx.collections.ObservableList;
import sample.be.Playlist;
import sample.be.Song;
import java.sql.*;

import java.io.IOException;
import java.sql.Connection;

public class PlayListDAO {
    private final JDBCConnectionPool connectionPool;

    public PlayListDAO() throws IOException {
        connectionPool = JDBCConnectionPool.getInstance();
    }

    public Playlist createPlaylist(String name) throws SQLException{
        String sql = "INSERT INTO Playlist (Name) VALUES(?);";
        Connection con = connectionPool.checkOut(); // <<< Using the object pool here <<<
        try (PreparedStatement st = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)){
            st.setString(1,name);
            st.executeUpdate();
            ResultSet rs = st.getGeneratedKeys();
            int id = 0;
            if (rs.next()){
                id = rs.getInt(1);
            }
            Playlist playlist = new Playlist(name,id);
            return playlist;
        } catch (SQLException ex) {
            throw new SQLException("Could not create playlist", ex);
        } finally {
            connectionPool.checkIn(con);
        }

    }


}
