#include <iostream>
using namespace std;

int main(){
	cin.tie(NULL);
	ios::sync_with_stdio(false);
	
	long long A, B, V;
	long long day = 0;
	cin >> A >> B >> V;

	day = (V-B)/(A-B);
	if((V-B)%(A-B) != 0) day+=1;
	cout << day;
	return 0;
}
