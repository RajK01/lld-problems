package Elevator;

import java.util.PriorityQueue;

public class Elevator {
    private int currentFloor;
    private ElevatorState state;
    private Direction direction;
    private PriorityQueue<Integer> upRequests;
    private PriorityQueue<Integer> downRequests;

    public Elevator() {
        this.currentFloor = 0;  // Assume ground floor is 0
        this.state = ElevatorState.IDLE;
        this.direction = Direction.NONE;
        this.upRequests = new PriorityQueue<>();  // For upward movement (min-heap)
        this.downRequests = new PriorityQueue<>((a, b) -> b - a);  // For downward movement (max-heap)
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void addRequest(Request request) {
        if (request.getDirection() == Direction.UP) {
            upRequests.offer(request.getTargetFloor());
        } else {
            downRequests.offer(request.getTargetFloor());
        }
    }

    public void move() {
        if (state == ElevatorState.IDLE && !upRequests.isEmpty()) {
            state = ElevatorState.MOVING_UP;
            direction = Direction.UP;
        } else if (state == ElevatorState.IDLE && !downRequests.isEmpty()) {
            state = ElevatorState.MOVING_DOWN;
            direction = Direction.DOWN;
        }

        if (state == ElevatorState.MOVING_UP && !upRequests.isEmpty()) {
            currentFloor = upRequests.poll();
            System.out.println("Elevator stopped at floor: " + currentFloor);
        } else if (state == ElevatorState.MOVING_DOWN && !downRequests.isEmpty()) {
            currentFloor = downRequests.poll();
            System.out.println("Elevator stopped at floor: " + currentFloor);
        }

        if (upRequests.isEmpty() && downRequests.isEmpty()) {
            state = ElevatorState.IDLE;
            direction = Direction.NONE;
        }
    }

    public boolean isIdle() {
        return state == ElevatorState.IDLE;
    }
}