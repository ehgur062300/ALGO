#include <iostream>
#include <cmath>
#include <set>

using namespace std;

int main() {
	set<int> s;
	set<int>::iterator iter;
	int n, k;
	cin >> n >> k;

	if (k == 1) { 
		cout << 1; 
		return 0;
	}

	for (int i = 1; i <= sqrt(n); i++) {
		if (n % i == 0) { 
			s.emplace(i); 
			s.emplace(n / i);
		}
	}

	if (s.size() < k) { 
		cout << 0;
		return 0; 
	}

	iter = s.begin();
	for (int i = 0; i < k-1; i++) { iter++; }
	cout << *iter;

	return 0;
}