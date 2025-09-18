package org.playlistWeb.playlist.Web;

import org.playlistWeb.playlist.Web.musica;
import org.playlistWeb.playlist.Web.playlist;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class playlistService {

    private final List<playlist> playlists = new ArrayList<>();
    private int proximoIdPlaylist = 1;

    public int criarPlaylist(String nome) {
        playlist playlist = new playlist(proximoIdPlaylist++, nome);
        playlists.add(playlist);
        return playlist.getId();
    }

    public boolean adicionarMusica(int playlistId, musica musica) {
        for (playlist p : playlists) {
            if (p.getId() == playlistId) {
                p.getMusicas().add(musica);
                return true;
            }
        }
        return false;
    }

    public List<playlist> listarPlaylists() {
        return playlists;
    }

    public List<musica> listarMusicas(int playlistId) {
        for (playlist p : playlists) {
            if (p.getId() == playlistId) {
                return p.getMusicas();
            }
        }
        return null;
    }
}
