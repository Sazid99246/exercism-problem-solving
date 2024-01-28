export class Triangle {
  constructor(...sides) {
    if (sides.length === 3) {
      if (sides.every(side => side > 0)) {
        if (sides.every(side => side !== 0)) {
          if (
            sides[0] + sides[1] >= sides[2] &&
            sides[1] + sides[2] >= sides[0] &&
            sides[0] + sides[2] >= sides[1]
          ) {
            this.a = sides[0];
            this.b = sides[1];
            this.c = sides[2];
          } else {
            console.log('Triangle inequality condition not met.');
          }
        } else {
          console.log('All sides must be greater than zero.');
        }
      } else {
        console.log('All sides must be greater than zero.');
      }
    } else {
      console.log('A triangle must have exactly 3 sides.');
    }
  }

  get isEquilateral() {
    return this.a !== undefined && this.a === this.b && this.b === this.c && this.c === this.a;
  }

  get isIsosceles() {
    return (
      this.a !== undefined &&
      (this.a === this.b || this.b === this.c || this.c === this.a)
    );
  }

  get isScalene() {
    return this.a !== undefined && this.a !== this.b && this.b !== this.c && this.c !== this.a;
  }
}
