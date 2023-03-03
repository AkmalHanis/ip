# User Guide

## Features 
User commands:
1. Todo 
2. Deadline
3. Event
4. Mark
5. Unmark
5. Delete
6. Find
7. List
8. Bye


### Features details

## Usages
1. Todo: Add a specific task that you want to do into your list. This task will be saved by duke.

2. Deadline: Add a specific Deadline to a specific task you want to do.

3. Event: Add a specific Event that you want to save. The timeline of the event is also saved.

4. Mark/Unmark: Allows user to mark or unmark a specific task for tracking.

5. Delete: Allows user to delete a particular event from their list.

6. Find: Allows user to find a particular task based on keyword

7. List: List out all the tasks already saved into the list


### `Keyword` - Describe action

## Todo
Example: todo Read Book

```
1. [ ][T] Read Book
2. [ ][T] Go Home
3. [ ][T] Eat Food

todo Smell Grass 

1. [ ][T] Read Book
2. [ ][T] Go Home
3. [ ][T] Eat Food
4. [ ][T] Smell Grass 
```

## Deadline
Example: deadline Read Book /by sunday

```
1. [ ][T] Read Book
2. [ ][T] Go Home
3. [ ][T] Eat Food

deadline Read Book /by monday

1. [ ][T] Read Book
2. [ ][T] Go Home
3. [ ][T] Eat Food
4. [ ][D] Read Book (by: monday) 
```

## Event
Example: event Read Book /from monday /to tuesday

```
1. [ ][T] Read Book
2. [ ][T] Go Home
3. [ ][T] Eat Food

event Read Book /from monday /to tuesday

1. [ ][T] Read Book
2. [ ][T] Go Home
3. [ ][T] Eat Food
4. [ ][E] Read Book (from: monday to: tuesday) 
```

## Mark/Unmark
Example: Mark 1 / Unmark 1

```
1. [ ][T] Read Book
2. [ ][T] Go Home
3. [ ][T] Eat Food

mark 1

1. [X][T] Read Book
2. [ ][T] Go Home
3. [ ][T] Eat Food

unamrk 1

1. [ ][T] Read Book
2. [ ][T] Go Home
3. [ ][T] Eat Food
```

## Delete
Example: Delete 1

```
1. [ ][T] Read Book
2. [ ][T] Go Home
3. [ ][T] Eat Food

delete 2

1. [ ][T] Read Book
2. [ ][T] Eat Food

```
## Find
Example: Find Read Book

```
Find Read Book

-------------------------------------------------
Here are the Tasks which matches your word:

1. [ ][T] Read Book

```

## List
Example: List

```
1. [ ][T] Read Book
2. [ ][D] Read Magazine (by: Tuesday)

```


