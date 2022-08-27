#include <stdio.h>
#include <stdlib.h>
#define M 100

typedef struct queue
{
    int *data;
    int r;
    int f;
} que;

void creat_data(que *q)
{
    q->data = (int *)malloc(M * sizeof(int));
    q->r = q->f = -1;
}

void insertion(que *q, int n)
{
    if (q->r == M - 1)
    {
        printf("\nQueue overflow...");
        return;
    }
    q->r++;
    q->data[q->r] = n;
    printf("\n%d added...", n);
}

void deletion(que *q)
{
    if (q->r == q->f)
    {
        printf("\nQueue is empty...");
        return;
    }
    q->f++;
    printf("\nDeleted element = %d...", q->data[q->f]);
}

void display(que q)
{
    if (q.r == q.f)
    {
        printf("\nQueue empty...");
        return;
    }
    printf("\n:: Elements are given below ::\n");
    for (int i = q.f + 1; i <= (q.r); i++)
    {
        printf("%d | ", q.data[i]);
    }
}

int main()
{
    int ch = 0, n;
    que q;
    creat_data(&q);
    system("cls");
    printf("\n:: Queue using array ::\n");
    do
    {
        printf("\n1 : Insertion...\n2 : Deletion...\n3 : Displaying all element...\n0 : exit...");
        printf("\nChoice = ");
        scanf("%d", &ch);
        switch (ch)
        {
        case 1:
        {
            system("cls");
            printf("\nEnter element's value = ");
            scanf("%d", &n);
            insertion(&q, n);
            break;
        }
        case 2:
        {
            system("cls");
            deletion(&q);
            break;
        }
        case 3:
        {
            system("cls");
            display(q);
            break;
        }
        case 0:
        {
            system("cls");
            printf("\nExiting...");
            break;
        }
        default:
        {
            system("cls");
            printf("\n**Plese enter correct input...");
            break;
        }
        }
    } while (ch != 0);

    return 0;
}
