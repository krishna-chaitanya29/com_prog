package Fs_questions.Streams;

public class FS_72_Social-Media Analytics_Streams {
    
}
/*
 * A chat application stores each message with:
    • user ID (String)
    • message content (String)
    • timestamp (Instant)

Write a program that:
    1. Counts how many messages each user has sent.
    2. Determines each user’s last-seen time (the most recent timestamp).
    3. Sorts all users by:
         a. last-seen timestamp, newest first
         b. then by message count, highest first
    4. Prints the top three users by this combined ordering.
    
    
Expected Output:
----------------
Top 3 active users: [bob, alice, carol]
 */

 /*
  * import java.time.Instant;
import java.util.*;
import java.util.stream.*;

public class TopActiveUsers {
    // Domain class
    static class Message {
        private final String userId;
        private final String content;
        private final Instant timestamp;
        
        //WRITE YOUR CODE HERE
    }

    public static void main(String[] args) {
        Instant now = Instant.now();
        List<Message> messages = List.of(
            new Message("alice", "Hi there!",          now),
            new Message("bob",   "Hello!",             now.plusSeconds(5)),
            new Message("alice", "How are you?",       now.plusSeconds(10)),
            new Message("carol", "Good morning",       Instant.parse("2025-06-17T09:30:00Z")),
            new Message("bob",   "I'm fine.",          Instant.parse("2022-06-17T09:31:00Z")),
            new Message("dave",  "Hey!",               now.plusSeconds(15)),
            new Message("alice", "Let's meet up",      Instant.parse("2024-06-17T09:32:30Z")),
            new Message("bob",   "Sure!",              now.plusSeconds(20))
        );

        //WRITE YOUR CODE HERE
    }
}
  */