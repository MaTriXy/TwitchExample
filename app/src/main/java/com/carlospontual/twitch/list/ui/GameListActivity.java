package com.carlospontual.twitch.list.ui;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.carlospontual.twitch.list.R;
import com.carlospontual.twitch.list.data.models.TopGames;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;

import java.io.IOException;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class GameListActivity extends AppCompatActivity {

    @Bind(R.id.recycler)
    RecyclerView recycler;
    @Bind(R.id.fab)
    FloatingActionButton fab;

    GameListAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        ButterKnife.bind(this);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        recycler.setLayoutManager(new GridLayoutManager(this, 2));
        recycler.setAdapter(new GameListAdapter(this, mockData().games));
    }

    @OnClick(R.id.fab)
    public void onFabClick(View view) {
        Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show();
    }

    private TopGames mockData() {
        Moshi moshi = new Moshi.Builder().build();
        JsonAdapter<TopGames> jsonAdapter = moshi.adapter(TopGames.class);
        String json = "{\"_total\":1261,\"_links\":{\"self\":\"https://api.twitch.tv/kraken/games/top?limit=10&offset=0\",\"next\":\"https://api.twitch.tv/kraken/games/top?limit=10&offset=10\"},\"top\":[{\"viewers\":107154,\"channels\":893,\"game\":{\"name\":\"Counter-Strike: Global Offensive\",\"_id\":32399,\"giantbomb_id\":36113,\"box\":{\"large\":\"http://static-cdn.jtvnw.net/ttv-boxart/Counter-Strike:%20Global%20Offensive-272x380.jpg\",\"medium\":\"http://static-cdn.jtvnw.net/ttv-boxart/Counter-Strike:%20Global%20Offensive-136x190.jpg\",\"small\":\"http://static-cdn.jtvnw.net/ttv-boxart/Counter-Strike:%20Global%20Offensive-52x72.jpg\",\"template\":\"http://static-cdn.jtvnw.net/ttv-boxart/Counter-Strike:%20Global%20Offensive-{width}x{height}.jpg\"},\"logo\":{\"large\":\"http://static-cdn.jtvnw.net/ttv-logoart/Counter-Strike:%20Global%20Offensive-240x144.jpg\",\"medium\":\"http://static-cdn.jtvnw.net/ttv-logoart/Counter-Strike:%20Global%20Offensive-120x72.jpg\",\"small\":\"http://static-cdn.jtvnw.net/ttv-logoart/Counter-Strike:%20Global%20Offensive-60x36.jpg\",\"template\":\"http://static-cdn.jtvnw.net/ttv-logoart/Counter-Strike:%20Global%20Offensive-{width}x{height}.jpg\"},\"_links\":{}}},{\"viewers\":64603,\"channels\":1981,\"game\":{\"name\":\"League of Legends\",\"_id\":21779,\"giantbomb_id\":24024,\"box\":{\"large\":\"http://static-cdn.jtvnw.net/ttv-boxart/League%20of%20Legends-272x380.jpg\",\"medium\":\"http://static-cdn.jtvnw.net/ttv-boxart/League%20of%20Legends-136x190.jpg\",\"small\":\"http://static-cdn.jtvnw.net/ttv-boxart/League%20of%20Legends-52x72.jpg\",\"template\":\"http://static-cdn.jtvnw.net/ttv-boxart/League%20of%20Legends-{width}x{height}.jpg\"},\"logo\":{\"large\":\"http://static-cdn.jtvnw.net/ttv-logoart/League%20of%20Legends-240x144.jpg\",\"medium\":\"http://static-cdn.jtvnw.net/ttv-logoart/League%20of%20Legends-120x72.jpg\",\"small\":\"http://static-cdn.jtvnw.net/ttv-logoart/League%20of%20Legends-60x36.jpg\",\"template\":\"http://static-cdn.jtvnw.net/ttv-logoart/League%20of%20Legends-{width}x{height}.jpg\"},\"_links\":{}}},{\"viewers\":35367,\"channels\":229,\"game\":{\"name\":\"Hearthstone: Heroes of Warcraft\",\"_id\":138585,\"giantbomb_id\":42033,\"box\":{\"large\":\"http://static-cdn.jtvnw.net/ttv-boxart/Hearthstone:%20Heroes%20of%20Warcraft-272x380.jpg\",\"medium\":\"http://static-cdn.jtvnw.net/ttv-boxart/Hearthstone:%20Heroes%20of%20Warcraft-136x190.jpg\",\"small\":\"http://static-cdn.jtvnw.net/ttv-boxart/Hearthstone:%20Heroes%20of%20Warcraft-52x72.jpg\",\"template\":\"http://static-cdn.jtvnw.net/ttv-boxart/Hearthstone:%20Heroes%20of%20Warcraft-{width}x{height}.jpg\"},\"logo\":{\"large\":\"http://static-cdn.jtvnw.net/ttv-logoart/Hearthstone:%20Heroes%20of%20Warcraft-240x144.jpg\",\"medium\":\"http://static-cdn.jtvnw.net/ttv-logoart/Hearthstone:%20Heroes%20of%20Warcraft-120x72.jpg\",\"small\":\"http://static-cdn.jtvnw.net/ttv-logoart/Hearthstone:%20Heroes%20of%20Warcraft-60x36.jpg\",\"template\":\"http://static-cdn.jtvnw.net/ttv-logoart/Hearthstone:%20Heroes%20of%20Warcraft-{width}x{height}.jpg\"},\"_links\":{}}},{\"viewers\":31031,\"channels\":2651,\"game\":{\"name\":\"Call of Duty: Black Ops III\",\"_id\":489401,\"giantbomb_id\":48754,\"box\":{\"large\":\"http://static-cdn.jtvnw.net/ttv-boxart/Call%20of%20Duty:%20Black%20Ops%20III-272x380.jpg\",\"medium\":\"http://static-cdn.jtvnw.net/ttv-boxart/Call%20of%20Duty:%20Black%20Ops%20III-136x190.jpg\",\"small\":\"http://static-cdn.jtvnw.net/ttv-boxart/Call%20of%20Duty:%20Black%20Ops%20III-52x72.jpg\",\"template\":\"http://static-cdn.jtvnw.net/ttv-boxart/Call%20of%20Duty:%20Black%20Ops%20III-{width}x{height}.jpg\"},\"logo\":{\"large\":\"http://static-cdn.jtvnw.net/ttv-logoart/Call%20of%20Duty:%20Black%20Ops%20III-240x144.jpg\",\"medium\":\"http://static-cdn.jtvnw.net/ttv-logoart/Call%20of%20Duty:%20Black%20Ops%20III-120x72.jpg\",\"small\":\"http://static-cdn.jtvnw.net/ttv-logoart/Call%20of%20Duty:%20Black%20Ops%20III-60x36.jpg\",\"template\":\"http://static-cdn.jtvnw.net/ttv-logoart/Call%20of%20Duty:%20Black%20Ops%20III-{width}x{height}.jpg\"},\"_links\":{}}},{\"viewers\":28316,\"channels\":155,\"game\":{\"name\":\"Heroes of the Storm\",\"_id\":32959,\"giantbomb_id\":36739,\"box\":{\"large\":\"http://static-cdn.jtvnw.net/ttv-boxart/Heroes%20of%20the%20Storm-272x380.jpg\",\"medium\":\"http://static-cdn.jtvnw.net/ttv-boxart/Heroes%20of%20the%20Storm-136x190.jpg\",\"small\":\"http://static-cdn.jtvnw.net/ttv-boxart/Heroes%20of%20the%20Storm-52x72.jpg\",\"template\":\"http://static-cdn.jtvnw.net/ttv-boxart/Heroes%20of%20the%20Storm-{width}x{height}.jpg\"},\"logo\":{\"large\":\"http://static-cdn.jtvnw.net/ttv-logoart/Heroes%20of%20the%20Storm-240x144.jpg\",\"medium\":\"http://static-cdn.jtvnw.net/ttv-logoart/Heroes%20of%20the%20Storm-120x72.jpg\",\"small\":\"http://static-cdn.jtvnw.net/ttv-logoart/Heroes%20of%20the%20Storm-60x36.jpg\",\"template\":\"http://static-cdn.jtvnw.net/ttv-logoart/Heroes%20of%20the%20Storm-{width}x{height}.jpg\"},\"_links\":{}}},{\"viewers\":18422,\"channels\":296,\"game\":{\"name\":\"Dota 2\",\"_id\":29595,\"giantbomb_id\":32887,\"box\":{\"large\":\"http://static-cdn.jtvnw.net/ttv-boxart/Dota%202-272x380.jpg\",\"medium\":\"http://static-cdn.jtvnw.net/ttv-boxart/Dota%202-136x190.jpg\",\"small\":\"http://static-cdn.jtvnw.net/ttv-boxart/Dota%202-52x72.jpg\",\"template\":\"http://static-cdn.jtvnw.net/ttv-boxart/Dota%202-{width}x{height}.jpg\"},\"logo\":{\"large\":\"http://static-cdn.jtvnw.net/ttv-logoart/Dota%202-240x144.jpg\",\"medium\":\"http://static-cdn.jtvnw.net/ttv-logoart/Dota%202-120x72.jpg\",\"small\":\"http://static-cdn.jtvnw.net/ttv-logoart/Dota%202-60x36.jpg\",\"template\":\"http://static-cdn.jtvnw.net/ttv-logoart/Dota%202-{width}x{height}.jpg\"},\"_links\":{}}},{\"viewers\":18085,\"channels\":27,\"game\":{\"name\":\"Super Smash Bros. Melee\",\"_id\":16282,\"giantbomb_id\":17743,\"box\":{\"large\":\"http://static-cdn.jtvnw.net/ttv-boxart/Super%20Smash%20Bros.%20Melee-272x380.jpg\",\"medium\":\"http://static-cdn.jtvnw.net/ttv-boxart/Super%20Smash%20Bros.%20Melee-136x190.jpg\",\"small\":\"http://static-cdn.jtvnw.net/ttv-boxart/Super%20Smash%20Bros.%20Melee-52x72.jpg\",\"template\":\"http://static-cdn.jtvnw.net/ttv-boxart/Super%20Smash%20Bros.%20Melee-{width}x{height}.jpg\"},\"logo\":{\"large\":\"http://static-cdn.jtvnw.net/ttv-logoart/Super%20Smash%20Bros.%20Melee-240x144.jpg\",\"medium\":\"http://static-cdn.jtvnw.net/ttv-logoart/Super%20Smash%20Bros.%20Melee-120x72.jpg\",\"small\":\"http://static-cdn.jtvnw.net/ttv-logoart/Super%20Smash%20Bros.%20Melee-60x36.jpg\",\"template\":\"http://static-cdn.jtvnw.net/ttv-logoart/Super%20Smash%20Bros.%20Melee-{width}x{height}.jpg\"},\"_links\":{}}},{\"viewers\":14453,\"channels\":1435,\"game\":{\"name\":\"Tom Clancy's The Division\",\"_id\":369579,\"giantbomb_id\":42918,\"box\":{\"large\":\"http://static-cdn.jtvnw.net/ttv-boxart/Tom%20Clancy%27s%20The%20Division-272x380.jpg\",\"medium\":\"http://static-cdn.jtvnw.net/ttv-boxart/Tom%20Clancy%27s%20The%20Division-136x190.jpg\",\"small\":\"http://static-cdn.jtvnw.net/ttv-boxart/Tom%20Clancy%27s%20The%20Division-52x72.jpg\",\"template\":\"http://static-cdn.jtvnw.net/ttv-boxart/Tom%20Clancy%27s%20The%20Division-{width}x{height}.jpg\"},\"logo\":{\"large\":\"http://static-cdn.jtvnw.net/ttv-logoart/Tom%20Clancy%27s%20The%20Division-240x144.jpg\",\"medium\":\"http://static-cdn.jtvnw.net/ttv-logoart/Tom%20Clancy%27s%20The%20Division-120x72.jpg\",\"small\":\"http://static-cdn.jtvnw.net/ttv-logoart/Tom%20Clancy%27s%20The%20Division-60x36.jpg\",\"template\":\"http://static-cdn.jtvnw.net/ttv-logoart/Tom%20Clancy%27s%20The%20Division-{width}x{height}.jpg\"},\"_links\":{}}},{\"viewers\":12459,\"channels\":648,\"game\":{\"name\":\"Minecraft\",\"_id\":27471,\"giantbomb_id\":30475,\"box\":{\"large\":\"http://static-cdn.jtvnw.net/ttv-boxart/Minecraft-272x380.jpg\",\"medium\":\"http://static-cdn.jtvnw.net/ttv-boxart/Minecraft-136x190.jpg\",\"small\":\"http://static-cdn.jtvnw.net/ttv-boxart/Minecraft-52x72.jpg\",\"template\":\"http://static-cdn.jtvnw.net/ttv-boxart/Minecraft-{width}x{height}.jpg\"},\"logo\":{\"large\":\"http://static-cdn.jtvnw.net/ttv-logoart/Minecraft-240x144.jpg\",\"medium\":\"http://static-cdn.jtvnw.net/ttv-logoart/Minecraft-120x72.jpg\",\"small\":\"http://static-cdn.jtvnw.net/ttv-logoart/Minecraft-60x36.jpg\",\"template\":\"http://static-cdn.jtvnw.net/ttv-logoart/Minecraft-{width}x{height}.jpg\"},\"_links\":{}}},{\"viewers\":12241,\"channels\":37,\"game\":{\"name\":\"Super Smash Bros. for Wii U\",\"_id\":488353,\"giantbomb_id\":0,\"box\":{\"large\":\"http://static-cdn.jtvnw.net/ttv-boxart/Super%20Smash%20Bros.%20for%20Wii%20U-272x380.jpg\",\"medium\":\"http://static-* Connection #0 to host api.twitch.tv left intact\n" +
                "cdn.jtvnw.net/ttv-boxart/Super%20Smash%20Bros.%20for%20Wii%20U-136x190.jpg\",\"small\":\"http://static-cdn.jtvnw.net/ttv-boxart/Super%20Smash%20Bros.%20for%20Wii%20U-52x72.jpg\",\"template\":\"http://static-cdn.jtvnw.net/ttv-boxart/Super%20Smash%20Bros.%20for%20Wii%20U-{width}x{height}.jpg\"},\"logo\":{\"large\":\"http://static-cdn.jtvnw.net/ttv-logoart/Super%20Smash%20Bros.%20for%20Wii%20U-240x144.jpg\",\"medium\":\"http://static-cdn.jtvnw.net/ttv-logoart/Super%20Smash%20Bros.%20for%20Wii%20U-120x72.jpg\",\"small\":\"http://static-cdn.jtvnw.net/ttv-logoart/Super%20Smash%20Bros.%20for%20Wii%20U-60x36.jpg\",\"template\":\"http://static-cdn.jtvnw.net/ttv-logoart/Super%20Smash%20Bros.%20for%20Wii%20U-{width}x{height}.jpg\"},\"_links\":{}}}]}";
        try {
            return jsonAdapter.fromJson(json);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_list, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
