/*
MIT License

Copyright (c) 2020 Jean-Jacques François Reibel

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
*/

class Car(wheels: Int, doors: Int, cylinders: Int) {
    var wheels = 0
    var doors = 0
    var cylinders = 0
    init{
      this.wheels = wheels
      this.doors = doors
      this.cylinders = cylinders
    }

    fun addWheels(wheels: Int){
      this.wheels = this.wheels + wheels
    }

    fun addDoors(doors: Int){
      this.doors = this.doors + doors
    }

    fun addCylinder(cylinders: Int){
      this.cylinders = this.cylinders + cylinders
    }

    fun deleteWheels(wheels: Int){
      this.wheels = this.wheels - wheels
    }

    fun deleteDoors(doors: Int){
      this.doors = this.doors - doors
    }

    fun deleteCylinder(cylinders: Int){
      this.cylinders = this.cylinders - cylinders
    }
}

fun main(args: Array<String>) {
  println("Creating car.")
  var subaru = Car(4, 4, 4)
  println("Adding wheel directly to car object.")
  subaru.wheels = 5
  println("Wheels check: " + subaru.wheels)
  println("Doors check: " + subaru.doors)
  println("Cylinders check: " + subaru.cylinders)
  println("")
  println("Removing wheel using class method.")
  subaru.deleteWheels(1)
  println("Wheels check: " + subaru.wheels)
  println("Doors check: " + subaru.doors)
  println("Cylinders check: " + subaru.cylinders)
  println("")
}