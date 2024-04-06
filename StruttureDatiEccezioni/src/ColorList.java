import exceptions.ColorNotFoundException;

import java.util.ArrayList;
import java.util.List;

public class ColorList
{
    public static boolean colorIsInList(List<String> colorList, String color)
    {
        return colorList.contains(color) ? true : false;
    }

    public static int indexOfColor(List<String> colorList, String color)
    {
        try
        {
            if (!colorList.contains(color))
                throw new ColorNotFoundException();
            return colorList.indexOf(color);
        }
        catch (ColorNotFoundException ex)
        {
            System.out.println(ex.getMessage());
        }
        return -1;
    }

    public static void main(String[] args)
    {
        List<String> colorList = new ArrayList<>(List.of("Rosso", "Arancione", "Giallo", "Verde"));
        /*colorList.add("Rosso");
        colorList.add("Arancione");
        colorList.add("Giallo");
        colorList.add("Verde");*/
        for (String color : colorList)
            System.out.println("Colore: " + color);

        System.out.println(colorIsInList(colorList, "Arancione"));
        System.out.println(colorIsInList(colorList, "Bianco"));
        System.out.println();
        System.out.println(indexOfColor(colorList, "Arancione"));
        System.out.println(indexOfColor(colorList, "Bianco"));
    }
}
