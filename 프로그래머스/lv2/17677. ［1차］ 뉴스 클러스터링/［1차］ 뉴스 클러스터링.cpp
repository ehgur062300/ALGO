#include <string>
#include <map>
#include <algorithm>

using namespace std;

string capitalizeString(string s){
    transform(s.begin(), s.end(), s.begin(),
                   [](unsigned char c){ return toupper(c); });
    return s;
}

int solution(string str1, string str2) {
    int answer = 0;
    int uni = 0;
    int sub = 0;
    unordered_map<string, int> m1;
    unordered_map<string, int> m2;
    if(str1.length() == 0 && str2.length() == 0){ return 1; }
    str1 = capitalizeString(str1);
    str2 = capitalizeString(str2);
    
    if(str1 == str2){ return 65536; }
    
    for(int i=1; i<str1.length(); i++){
        string temp1 = "";
        if(str1[i-1]<65 || str1[i-1]>90 || str1[i]<65 || str1[i]>90){continue;}
        
        temp1 += str1[i-1];
        temp1 += str1[i];
        m1[temp1]++;
    }
    for(int j=1; j<str2.length(); j++){
       string temp2 = "";
       if(str2[j-1]<65 || str2[j-1]>90 || str2[j]<65 || str2[j]>90){continue;}
       
        temp2 += str2[j-1];
        temp2 += str2[j];
           m2[temp2]++;
       }
    
    unordered_map<string, int>::iterator it;
   for(it = m1.begin(); it != m1.end(); it++){
        if(m2[it->first]){
            sub += min(m2[it->first], m1[it->first]);
            uni += max(m2[it->first], m1[it->first]);
        }
        else{ uni += it->second; }
    }
    
    for(it = m2.begin(); it != m2.end(); it++){
        if(!m1[it->first]){
            uni += it->second;
        }
    }
    
    answer = sub*65536 / uni;
    return answer;
}