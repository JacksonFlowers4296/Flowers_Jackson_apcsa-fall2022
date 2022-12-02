/**
 * This class contains class (static) methods
 * that will help you test the Picture class
 * methods.  Uncomment the methods and the code
 * in the main to test.
 *
 * @author Barbara Ericson
 */
public class PictureTester {



  
  public static void testZeroBlue() {
    Picture beach = new Picture("src/images/beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }

  
  public static void testMirrorVertical() {
    Picture caterpillar = new Picture("src/images/caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }

  
  public static void testMirrorTemple() {
    Picture temple = new Picture("src/images/temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }

 
  public static void testCollage() {
    Picture canvas = new Picture( "src/images/640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }

  
  public static void testEdgeDetection() {
    Picture swan = new Picture( "src/images/swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }

  public static void testKeepOnlyBlue() {
    Picture beach = new Picture("src/images/beach.jpg");
    beach.explore();
    beach.keepOnlyBlue();
    beach.explore();
  }

  public static void testKeepOnlyRed() {
    Picture beach = new Picture( "src/images/beach.jpg");
    beach.explore();
    beach.keepOnlyRed();
    beach.explore();
  }

  public static void testKeepOnlyGreen() {
    Picture beach = new Picture("src/images/beach.jpg");
    beach.explore();
    beach.keepOnlyGreen();
    beach.explore();
  }

  public static void testNegate() {
    Picture beach = new Picture("src/images/beach.jpg");
    beach.explore();
    beach.negate();
    beach.explore();
  }

  public static void testGrayscale() {
    Picture beach = new Picture("src/images/beach.jpg");
    beach.explore();
    beach.grayscale();
    beach.explore();
  }

  public static void testFixUnderwater() {
    Picture water = new Picture("src/images/water.jpg");
    water.explore();
    water.fixUnderwater();
    water.explore();
  }

  public static void testMirrorArms() {
    Picture snowman = new Picture( "src/images/snowman.jpg");
    snowman.explore();
    snowman.mirrorArms();
    snowman.explore();
  }

  public static void testMirrorGull() {
    Picture gull = new Picture("src/images/seagull.jpg");
    gull.explore();
    gull.mirrorGull();
    gull.explore();
  }

  public static void testMirrorDiagonal() {
    Picture beach = new Picture("src/images/beach.jpg");
    beach.explore();
    beach.mirrorDiagonal();
    beach.explore();
  }

  public static void testCopy() {
    Picture beach = new Picture("src/images/beach.jpg");
    beach.explore();
    Picture seagull = new Picture("src/images/seagull.jpg");
    beach.copy(seagull, 235, 238, 320, 344, 0, 0);
    beach.explore();
  }

  public static void testGetCountRedOverValue(int value) {}

  public static void testSetRedToHalfValue(int value) {}

  public static void testGetAverageForColumn(int col) {}

  public static void testEdgeDetection2() {
	  Picture swan = new Picture( "src/images/swan.jpg");
	    swan.edgeDetection2(10);
	    swan.explore();
  }

  public static void testChromakey() {}

  public static void testSetRedToHalfValueInTopHalf() {}

  public static void testClearBlueOverValue(int val) {}
  

  public static void testMirrorVerticalRightToLeft() {
    Picture swan = new Picture( "src/images/swan.jpg");
    swan.explore();
    swan.mirrorVerticalRightToLeft();
    swan.explore();
  }

  public static void testMirrorHorizontal() {
    Picture motorcycle = new Picture( "src/images/redMotorcycle.jpg");
    motorcycle.explore();
    motorcycle.mirrorHorizontal();
    motorcycle.explore();
  }

  public static void testMirrorHorizontalBotToTop() {
    Picture motorcycle = new Picture( "src/images/redMotorcycle.jpg");
    motorcycle.explore();
    motorcycle.mirrorHorizontalBotToTop();
    motorcycle.explore();
  }

  public static void testMyCollage() {
    Picture canvas = new Picture( "src/images/640x480.jpg");
    canvas.myCollage();
    canvas.explore();
  }

 

  
  public static void main(String[] args) {
    
     // testZeroBlue();
    // testKeepOnlyBlue();
    // testKeepOnlyRed();
    // testKeepOnlyGreen();
    // testNegate();
    // testGrayscale();
    // testFixUnderwater();
    // testMirrorVertical();
    // testMirrorVerticalRightToLeft();
    // testMirrorHorizontal();
    // testMirrorHorizontalBotToTop();
    // testMirrorTemple();
    // testMirrorArms();
     testMirrorGull();
    // testMirrorDiagonal();
    // testCollage();
    // testCopy();
    // testMyCollage();
    // testEdgeDetection();
	// testEdgeDetection2();
    // testChromakey();
    // testGetCountRedOverValue(250);
    // testSetRedToHalfValueInTopHalf();
    // testClearBlueOverValue(0);
    // testGetAverageForColumn(0);
    
  }
}