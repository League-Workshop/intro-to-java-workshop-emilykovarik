PImage rainbow;
PImage unicorn;
void setup(){
  rainbow = loadImage("rainbow.jpg");
                unicorn = loadImage("unicorn.png");


size(800, 600);

rainbow.resize(800,600);
background(rainbow);
}
void draw(){
  background(rainbow);

                image(unicorn, mouseX, mouseY);


}