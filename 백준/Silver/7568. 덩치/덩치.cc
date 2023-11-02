#include <iostream>

using namespace std;

struct Info{
	int weight;
	int height;
};

int main(){
	cin.tie(NULL);
	cout.tie(NULL);
	ios::sync_with_stdio(false);
	
	int N;
	cin >> N;
	int arr[50] {0,};
	Info data[N];
	
	for(int i = 0; i < N; i++){
		cin >> data[i].weight >> data[i].height;
	}
	
	for(int i = 0; i < N; i++){
		for(int j = 0; j < N; j++){
			if(i == j){ continue; }
			if(data[i].weight < data[j].weight && data[i].height < data[j].height){
				arr[i] += 1;
			}
		}
	}
	for(int i = 0; i < N; i++){
		cout << arr[i] + 1 << " ";
	}
	return 0;
}
