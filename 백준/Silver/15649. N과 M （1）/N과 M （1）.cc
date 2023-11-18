#include <iostream>

using namespace std;

int arr[8];
bool use[8];
int n, m;

void func(int k) {
	if (k == m) {
		for (int t = 0; t < m; t++) {
			cout << arr[t] << " ";
		}
		cout << "\n";
		return;
	}
	for (int j = 1; j <= n; j++) {
		if (!use[j]) {
			arr[k] = j;
			use[j] = true;
			func(k + 1);
			use[j] = false;
		}
	}

}

int main() {
	cin.tie(0); cout.tie(0);
	ios::sync_with_stdio(0);

	cin >> n >> m;

	for (int i = 0; i < 8; i++) { use[i] = false; }
	func(0);

	return 0;
}