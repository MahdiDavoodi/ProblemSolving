class Polygon {
  constructor(array) {
    this.sides = array;
  }
  perimeter() {
    let result = 0;
    for (let i of this.sides) result += i;
    return result;
  }
}
/*
 * You can define classes in Js
 */

const rectangle = new Polygon([10, 20, 10, 20]);
const square = new Polygon([10, 10, 10, 10]);
const pentagon = new Polygon([10, 20, 30, 40, 43]);

console.log(rectangle.perimeter());
console.log(square.perimeter());
console.log(pentagon.perimeter());
