@main def main() =
  println("Area of a disc with radius 5: " + areaOfDisc(5))
  println("35 Celcius in Fahrenheit: " + celciusToFahrenheit(35))
  println("Volume of sphere with radius 5: " + volumeOfSphere(5))
  println("Wholesale cost for 60 copies: " + wholesaleCost(60))
  println("Total running time: " + runningTime(2, 3, 2))

def areaOfDisc(radius: Double): Double = math.Pi * math.pow(radius, 2)

def celciusToFahrenheit(celcius: Double): Double = celcius * 1.8000 + 32.00

def volumeOfSphere(radius: Double): Double = (4.0/3.0) * math.Pi * math.pow(radius, 3)

def wholesaleCost(copies: Int): Double = 
  val cover_price = 24.95
  val discount = 0.40
  val shipping_cost = if (copies <= 50) 3 else (3 + (copies - 50) * 0.75)
  copies * cover_price * (1 - discount) + shipping_cost

def runningTime(start: Int, middle: Int, end: Int) = start * 8 + middle * 7 + end * 8