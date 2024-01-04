#include <iostream>
#include <queue>
using namespace std;

void solve(int *arr, int k)
{
  priority_queue<int, vector<int>, greater<int>> pq;

  for (int i = 0; i < 5; i++)
    pq.push(arr[i]);

  while (k)
  {
    cout << pq.top() << " ";
    pq.pop();
    k--;
  }
}

int main()
{
  int arr[5] = {5, 2, 7, 1, 3};
  int k = 2;
  solve(arr, k);

  return 0;
}