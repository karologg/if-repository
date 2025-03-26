#include <stdio.h>

double quadcubo (double r, double *r3) {
    double quad = r * r;
    *r3 = quad * r;
    return quad;
}



int main() {
    double r3, q;
    q = quadcubo(2.0, &r3);
    printf("quad = %g cubo = %g", q, r3);
}
