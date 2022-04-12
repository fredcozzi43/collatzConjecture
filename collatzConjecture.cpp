#include <iostream>
using namespace std;

int odd(int n){
    n = (n*3) + 1;
    cout << n << "\n";
    return n;
}

int even(int n){
    n = n/2;
    cout << n << "\n";
    return n;
}

int isEven(int n){
    if (n==1){
        return n;
    }
    else if (n%2==0){
        n = even(n);
        isEven(n);
    }
    else{
        n = odd(n);
        isEven(n);
    }
}

int main() {
    int n;
    cout << "Type a number: ";
    cin >> n;
    isEven(n);
}