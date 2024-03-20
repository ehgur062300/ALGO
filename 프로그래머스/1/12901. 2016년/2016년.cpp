#include <string>
#include <vector>

using namespace std;

string solution(int a, int b) {
    string answer = "";
    int month_list[12] = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    string week_day_list[7] = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
    string week_day = "";
    int total_day = 0;
    
    for (int i=0;i<a-1;i++) {
    	total_day += month_list[i];
    }
    
    total_day += b + 4;
    answer = week_day_list[total_day%7];
    return answer;
}