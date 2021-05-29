package statemachine.elevator;

public enum ElevatorState {

    GROUND_FLOOR_OPEN{
        ElevatorState next() {
            return ElevatorState.GROUND_FLOOR_CLOSE;
        }
    },

    GROUND_FLOOR_CLOSE{
        ElevatorState next() {
            return ElevatorState.FIRST_FLOOR_OPEN;
        }

    },

    FIRST_FLOOR_OPEN{
        ElevatorState next() {
            return ElevatorState.FIRST_FLOOR_CLOSE;
        }
    },

    FIRST_FLOOR_CLOSE{
        ElevatorState next() {
            return ElevatorState.GROUND_FLOOR_OPEN;
        }

    };

    abstract ElevatorState next();
}
