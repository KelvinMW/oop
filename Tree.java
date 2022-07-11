import java.lang.*;
import java.awt.*;

class Tree{
    //attributes
    double height;
    double trunkDiameter;
    TreeType treeType;
    static Color TRUNK_COLOR = new Color(23,1,4);

    //constructor
    Tree(double height, double trunkDiameter, TreeType treeType){
        this.height = height;
        this.trunkDiameter = trunkDiameter;
        this.treeType = treeType;
    }

    //behavior
    void grow(){
        this.height = this.height +40;
        this.trunkDiameter = this.trunkDiameter +2;

    }
    void Tall(){
        if(this.height >50){
            System.out.println("The "+this.treeType+" height is taller than 50!");
        } else {
            System.out.println("The "+this.treeType+" height is less than 50!");
        }
    }
}