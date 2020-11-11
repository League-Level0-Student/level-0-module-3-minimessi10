
void setup() {
 
  // set the size of your sketch
  size(500,700);
}

void draw() {
  
  //Starting with the largest ellipse, use a for loop to draw a bullseye with ellipses.\
  int size=350;
  
  
  
  
  for (int i = 0; i < 5; i++) {
  //Use an if statement and modulo to alternate the color of your rings.
    if (i % 2 == 0) {
        System.out.println("number is even");
        fill(#08FF09);
    }
    else {
        System.out.println("number is odd");
        fill(#0A0A0A);
        
    }
  
  ellipse(240,260,size,size);
  size-=55;
  
}}
