package org.example;

import java.awt.*;
import java.awt.image.*;
import java.util.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create images of different resolutions
        BufferedImage img1 = new BufferedImage(64, 64, BufferedImage.TYPE_INT_RGB);
        BufferedImage img2 = new BufferedImage(128, 128, BufferedImage.TYPE_INT_RGB);
        BufferedImage img3 = new BufferedImage(256, 256, BufferedImage.TYPE_INT_RGB);

        // Create a list of images
        List<Image> images = new ArrayList<>();
        images.add(img1);
        images.add(img2);
        images.add(img3);

        // Create a MultiResolutionImage
        MultiResolutionImage multiResImage = new BaseMultiResolutionImage(images.toArray(new Image[0]));

        // Get image of a specific resolution
        Image variant = multiResImage.getResolutionVariant(128, 128);
        System.out.println("Variant width: " + variant.getWidth(null));
        System.out.println("Variant height: " + variant.getHeight(null));
    }
}