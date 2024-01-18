#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int main() {
  cin.tie(NULL);
  cout.tie(NULL);
  ios::sync_with_stdio(false);
  
  int t;
  cin >> t;

  for(int i=0; i<t; i++){
    vector<pair<int,int>> v;
    int n;
    int cnt = 1;
    cin >> n;
    for(int j=0; j<n; j++){
      int a,b;
      cin >> a >> b;
      v.push_back(make_pair(a,b));
    }
    
    sort(v.begin(), v.end());
    
    int temp = v[0].second;
    for(int p=1; p<v.size(); p++){
      if(v[p].second < temp){
        cnt++;
        temp = v[p].second;
      }
    }
    cout << cnt << "\n";
  }

  return 0;
}