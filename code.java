// Chunk 3: User Roles & Access Management and Baggage Management System

class User {
    String userId, role;

    User(String userId, String role) {
        this.userId = userId;
        this.role = role;
    }
}

class AccessManagement {
    Map<String, String> userRoles = new HashMap<>();

    void addUser(User user) {
        userRoles.put(user.userId, user.role);
    }

    String getUserRole(String userId) {
        return userRoles.getOrDefault(userId, "Guest");
    }
}

class BaggageManagement {
    Map<String, String> baggageTracking = new HashMap<>();

    void checkInBaggage(String passengerId, String baggageId) {
        baggageTracking.put(passengerId, baggageId);
    }

    String getBaggageStatus(String passengerId) {
        return baggageTracking.getOrDefault(passengerId, "Baggage Not Found");
    }

    double calculateBaggagePrice(double weight) {
        double baseWeight = 20.0; // in kg
        double pricePerKg = 10.0; // price for excess weight
        return weight > baseWeight ? (weight - baseWeight) * pricePerKg : 0;
    }
}