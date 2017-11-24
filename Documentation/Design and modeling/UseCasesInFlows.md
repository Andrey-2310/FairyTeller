# Event flow for "Search" activity
## Main flow:
1.Use case begins when user focuses on the search input.
2.User types keywords for the full-text search.
3.User ckicks "Search" button, if there is no results of search E1 flow will be executed.
4.User looks through results. If user wants to make search once again A1 flow will be executed
5.Use case ends.
## A1 flow:
1.A1 flow begins.
2.User is not satisfied with the results of search
3.User decides to retype keywords
4.A1 flow ends.
## E1 flow:
1.E1 flow begins.
2.User gets error about empty list of response.
3.User returns to retyping keywords
4.E1 flow ends.

# Event flow for "Comment|Assess" activity
## Main flow:
1.Use case begins when user finds the book for commenting or assessing
2.If user wants to comment the book, A1 flow begins
3 If user wants to assess the book, A2 flow begins
4.Use case ends.
## A1 flow:
1.A1 flow begins
2.User presses "Add comment" button
3.Types comment in provided editor
4.Presses "Send" button
5.A1 flow ends
## A2 flow:
1.A2 flow begins
2.User chooses rating for the book
3.Estimates the book
4.A2 flow ends

# Event flow for "Create Book" activity
## Main flow:
1.Use case begins when user ckicks "Create new" button
2.If the user is not authenticated A1 flow will be executed
3.If the person is authenticated application will route the user to book creation page
4.User chooses the title of the book
5.Creates new chapter and types it's name
6.Presses "Edit" button
7.Creates chapter with provided editor
8.Presses "Save" button
9.If user wants to create one more chapter, it will be possible to return to step №5
10.User presses "Publish" button. Until this moment this work will stay in draft.
11.Use case ends.
## A1 flow:
1.A1 flow begins
2.If user decides to proceed without authentication it'll be possible to avoid it.
3.User authenticates in order to get possibility to create books
4.A1 flow ends

# Event flow for "Read" activity
## Main flow:
1.Use case begins when user finds the book for reading
2.User presses "Overview" button
3.If user just wants to overview the book, A1 flow begins
4.User presses "Read" button
5.Use case ends.
## A1 flow:
1.A1 flow begins
2.User looks through the general information about the book
3.If user decides that it's a good one, "Read" button will be pressed
4.If user decides not to enjoy current book, it's possible to choose another one
5.A1 flow ends
