//import stuff here?
//Your code here
 public class Program5{
     public static void main(String[] args){
        int royaleMiles = 286;
        int royaleGallons = 9;
        int koopaKingMiles = 412;
        int koopaKingGallons = 40;
        int pipeFrameMiles = 361;
        int pipeFrameGallons = 18;
        int badwagonMiles = 161;
        int badwagonGallons = 11;
        
        System.out.println("Mushroom Cup Prix Racer Average Miles/Per Gallon:\n");
        System.out.println("Royale averaged: "+ Math.round((double)royaleMiles/royaleGallons*10)/10.0+" mpg");
        System.out.println("Koopa King averaged: "+Math.round((double) koopaKingMiles/koopaKingGallons*10)/10.0+" mpg");
        System.out.println("Pipe Frame: "+Math.round((double) pipeFrameMiles/pipeFrameGallons*10)/10.0+" mpg");
        System.out.println("Badwagon: "+Math.round((double) badwagonMiles/badwagonGallons*10)/10.0+" mpg");
        
    }
}

//Paste console output below:
/*
Mushroom Cup Prix Racer Average Miles/Per Gallon:

Royale averaged: 31.8 mpg
Koopa King averaged: 10.3 mpg
Pipe Frame: 20.1 mpg
Badwagon: 14.6 mpg
*/
