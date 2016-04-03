package com.carlospontual.twitch.list.data.models;

import com.squareup.moshi.Json;

/**
 * Created by carlospontual on 02/04/16.
 */
public class GameData {

    public final String name;
    @Json(name = "_id")
    public final int id;
    @Json(name = "giantbomb_id")
    public final int giantbombId;
    @Json(name = "box")
    public final Images boxImages;
    @Json(name = "logo")
    public final Images logoImages;
    @Json(name = "_links")
    public final GameLinks links;

    public GameData(String name, int id, int giantbombId, Images boxImages, Images logoImages, GameLinks links) {
        this.name = name;
        this.id = id;
        this.giantbombId = giantbombId;
        this.boxImages = boxImages;
        this.logoImages = logoImages;
        this.links = links;
    }

    public static class Images {
        public final String large, medium, small, template;

        public Images(String large, String medium, String small, String template) {
            this.large = large;
            this.medium = medium;
            this.small = small;
            this.template = template;
        }
    }
}
