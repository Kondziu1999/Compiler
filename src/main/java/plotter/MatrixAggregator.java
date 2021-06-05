package plotter;

import data.ComplexDouble;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

class MatrixElement {
    public int v = 0; // wartosc pikesla (kolor)

    MatrixElement(int v) {
        this.v = v;
    }
}

// lista wierszy
public class MatrixAggregator implements Plotter {


    public ArrayList<ArrayList<MatrixElement>> matrix;
    public int size;
    public float minValueX = 0;
    public float maxValueX = 512;

    public float minValueY = 0;
    public float maxValueY = 512;

    public float minStep;
    public MatrixAggregator() {
        this(512);
    }
    public MatrixAggregator(int size) {
        this.size = size;
        matrix = new ArrayList<ArrayList<MatrixElement>>();
        for (int i = 0; i < size; i++) {
            matrix.add(new ArrayList<MatrixElement>());
            for (int j = 0; j < size; j++) {
                matrix.get(i).add(new MatrixElement(0));
            }
        }
        minStep = (maxValueX-minValueX)/size;
    }

    MatrixElement getValue(int x, int y) {
        return matrix.get(y).get(x);
    }

    void setValue(int x, int y, MatrixElement value) {
        matrix.get(y).set(x, value);
    }

    void flush() {
        matrix = null;

        matrix = new ArrayList<ArrayList<MatrixElement>>();
        for (int i = 0; i < size; i++) {
            matrix.add(new ArrayList<MatrixElement>());
            for (int j = 0; j < size; j++) {
                matrix.get(i).add(new MatrixElement(0));
            }
        }
    }

    @Override
    public void plot(float y, float x, int v) {
        int xM = Math.round((x-minValueX)*(size/(maxValueX-minValueX)));
        int yM = Math.round((y-minValueY)*(size/(maxValueY-minValueY)));
        if(xM >= size || yM >=size || xM < 0 || yM <0) return;
        setValue(xM, yM, new MatrixElement(v));
    }

    @Override
    public ComplexDouble getStep() {
        return new ComplexDouble((double)minStep,0.0);
    }

    @Override
    public void setup(int size, double min, double max) {
        minValueX = (float)min;
        maxValueX = (float)max;

        minValueY = (float)min;
         maxValueY = (float)max;
        this.size = size;
        matrix = new ArrayList<ArrayList<MatrixElement>>();
        for (int i = 0; i < size; i++) {
            matrix.add(new ArrayList<MatrixElement>());
            for (int j = 0; j < size; j++) {
                matrix.get(i).add(new MatrixElement(0));
            }
        }
        minStep = (maxValueX-minValueX)/size;
    }


    public void print() {
        for (var r : matrix) {
            for (var e : r) {
                System.out.print(e.v + " ");
            }
            System.out.println("");
        }
    }
    public void toImage(){
        var img = new BufferedImage(size+1,size+1,BufferedImage.TYPE_BYTE_GRAY);
        WritableRaster raster = (WritableRaster) img.getData();

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                raster.setPixel(i,size-j,new int[]{matrix.get(i).get(j).v,matrix.get(i).get(j).v,matrix.get(i).get(j).v});
            }
        }
        img.setData(raster);


        File outputfile = new File("image.jpg");
        try{
            ImageIO.write(img, "jpg", outputfile);
        }
        catch (Exception e){}
    }
    public void toFile(String name) {
        if (name == null)
            name = "res";

        FileWriter fileWriter = null;
        PrintWriter printWriter = null;
        try {
            fileWriter = new FileWriter(name);
            printWriter = new PrintWriter(fileWriter);
            for (var r : matrix) {
                for (var e : r) {
                    printWriter.print(e.v + " ");
                }
                printWriter.println("");
            }

        }
        catch (Exception e) {
            System.out.println(e.getStackTrace());
        }
        finally {
            printWriter.close();
        }

    }
}