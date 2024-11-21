public class Addition {

        private double firstInput;
        private double secondInput;
        private double finalInput;

        public void setFirstInput(double firstInput) {
            this.firstInput = firstInput;
        }

        public void setSecondInput(double secondInput){
            this.secondInput = secondInput;
        }

        public double getFirstInput() {
            this.finalInput = firstInput + secondInput;
            return finalInput;
        }

        public String toString() {
            return String.format("f%n", finalInput);
        }
    }

