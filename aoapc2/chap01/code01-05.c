#include<stdio.h>
#include<math.h>
int main(){
	double r,h,s1,s2,s;
	const double pi = 4.0 * atan(1.0);
	scanf("%lf%lf", &r, &h);
	s1 = pi * r * r; 
	s2 = 2.0 * pi * r * h; 
	s = s1*2.0 + s2;
	printf("%lf", s);
	return 0;
}
