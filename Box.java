/**Author:Karthika R Nair
 * Roll no:52
 * Date:20/07/25
 */
class Box{
    double width;
    double height;
    double depth;

}
class BoxDemo{
    public static void main(String[] args) {
        Box mybox = new Box();
        double volume;
        mybox.width = 10;
        mybox.height = 20;
        mybox.depth = 30;
        volume = mybox.width * mybox.height * mybox.depth;
        System.out.println("Volume is" +" "+  volume);
    }
}