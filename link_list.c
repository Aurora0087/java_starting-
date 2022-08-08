#include <stdio.h>
#include <stdlib.h>

typedef struct node
{
    int data;
    struct node *next;
} Nod;

Nod *head = NULL;

void insert(int valu)
{
    Nod *p = (Nod *)malloc(sizeof(Nod));
    //printf("%u", p);
    p->data = valu;
    p->next = head;
    head = p;
}

void printList()
{
    Nod *ptr = head;
    printf("\n\t:: Elements are given below ::\n");
    while (ptr != NULL)
    {
        printf("%d | ", ptr->data);
        ptr = ptr->next;
    }
}

int main()
{
    printf("\n\t:: Link List ::");
    int value,size;
    printf("\nSize of link list :: ");
    scanf("%d", &size);
    for (int i = 0; i < size; i++)
    {
        printf("\nEnter element number %d = ", i + 1);
        scanf("%d", &value);
        insert(value);
    }
    printList();
    return 0;
}