#include <iostream>
#include <queue>

using namespace std;

int main() {
	queue<int> nums;
	int n, k;
	cin >> n >> k;
	for (int i = 1; i <= n; i++) { nums.push(i); }

	int cnt = 1;
	cout << "<";
	while (1) {
		if (cnt == k) {
			cout << nums.front();
			nums.pop();
			if (nums.empty()) { break; }
			cout << ", ";
			cnt = 0;
		}
		else {
			int temp = nums.front();
			nums.pop();
			nums.push(temp);
		}
		cnt++;
	}
	cout << ">";

	return 0;
}