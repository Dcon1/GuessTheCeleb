package au.edu.jcu.sp3406.guesstheceleb;

import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.Image;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ImageManager {
    private String assetPath;
    private String[] imageNames;
    private AssetManager assetManager;

    ImageManager(AssetManager assetManager, String assetPath) throws IOException {
        this.assetManager = assetManager;
        this.assetPath = assetPath;
        try {
            assetManager.list("celebs");

        } catch (IOException e) {
            System.out.println(":could not get image names");
        }
    }
    Bitmap get(int i) throws IOException {
        InputStream stream = assetManager.open("celebs");
        Bitmap bitmap = BitmapFactory.decodeStream(stream);
        return bitmap;
    }
}
