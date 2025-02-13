#include <stdio.h>
#include <string.h>

typedef struct {
    int roll;
    char name[50];
    float gpa;
} student;

void sortStudents(student s[]) {  
    for (int i = 0; i < 2; i++) {  
        for (int j = 0; j < 2 - i; j++) {  
            if (s[j].gpa < s[j + 1].gpa) {  
                student temp = s[j];  
                s[j] = s[j + 1];  
                s[j + 1] = temp;
            }
        }
    }
}

int main() {
    student s[3];  

    for (int i = 0; i < 3; i++) {  
        printf("Enter roll, name, and GPA for student %d: ", i + 1);
        scanf("%d %s %f", &s[i].roll, s[i].name, &s[i].gpa);
    }

    sortStudents(s);  

    printf("\nStudents sorted by GPA (highest first):\n");
    for (int i = 0; i < 3; i++) {  
        printf("Roll: %d, Name: %s, GPA: %.2f\n", s[i].roll, s[i].name, s[i].gpa);
    }

    return 0;
}
