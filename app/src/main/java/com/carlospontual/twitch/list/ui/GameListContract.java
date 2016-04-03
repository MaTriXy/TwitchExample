package com.carlospontual.twitch.list.ui;

import com.carlospontual.twitch.list.data.models.Game;
import com.carlospontual.twitch.list.data.models.TopGames;

import java.util.List;

/**
 * Created by carlospontual on 03/04/16.
 */
public class GameListContract {

    interface View {
        void showRefreshing();
        void dismissRefreshing();
        void showError();
        void updateTopGames(List<Game> games);
        void showGameDetails(Game game);
        void showEmptyResult();
    }

    interface Presenter {
        void onCreate();
        void refreshTopGames();
        void onDestroy();
        void onGameSelected(Game game);
    }
}
