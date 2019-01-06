#include<stdio.h>
int main(){
	int n,m;
	scanf("%d",&n);
	m=(n%10)*100+(n/10%10)*10+(n/100%10);
	printf("%d",m);
	return 0;
}
