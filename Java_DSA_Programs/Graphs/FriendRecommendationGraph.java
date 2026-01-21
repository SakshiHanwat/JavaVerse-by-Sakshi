import java.util.*;

class FriendRecommendationGraph {

    static class Graph {
        private Map<Integer, List<Integer>> adjList = new HashMap<>();

        // Add user
        void addUser(int user) {
            adjList.putIfAbsent(user, new ArrayList<>());
        }

        // Add friendship (undirected graph)
        void addFriendship(int u1, int u2) {
            adjList.get(u1).add(u2);
            adjList.get(u2).add(u1);
        }

        // Find mutual friends
        void findMutualFriends(int user1, int user2) {
            Set<Integer> friends1 = new HashSet<>(adjList.get(user1));
            Set<Integer> friends2 = new HashSet<>(adjList.get(user2));

            friends1.retainAll(friends2);

            System.out.println("Mutual friends between " + user1 + " and " + user2 + ":");
            if (friends1.isEmpty()) {
                System.out.println("No mutual friends");
            } else {
                for (int f : friends1) {
                    System.out.println("User " + f);
                }
            }
        }
    }

    public static void main(String[] args) {

        Graph social = new Graph();

        for (int i = 1; i <= 6; i++) {
            social.addUser(i);
        }

        social.addFriendship(1, 2);
        social.addFriendship(1, 3);
        social.addFriendship(2, 4);
        social.addFriendship(3, 4);
        social.addFriendship(3, 5);
        social.addFriendship(4, 6);

        social.findMutualFriends(1, 4);
    }
}
