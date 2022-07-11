package by.bsuir.lesson1.linearprograms;



public class Task6 {
    public static void main(String[] args) {
        double x = -8;
        double y = 0;

        boolean isPointBelongsArea;

        isPointBelongsArea = ((x >= -2 && x <= 2) && (y >= 0 && y <= 4)) ||
                ((x >= -4 && x <= 4) && (y >= -3 && y <= 0)) ? true : false;

        System.out.println("Точка с координатами (" + x + "; " + y + ") принадлежит закрашенной области? " + isPointBelongsArea);
    }
}
