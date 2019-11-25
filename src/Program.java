

import java.util.*;

public class Program {
    private static List<Instruction> instructions = new ArrayList<>();
    private static Map<String, Double> variables = new TreeMap<>();
    private static Map<Integer, Integer> indexToLabel = new TreeMap<>();
    private static boolean jumpFlag = false;
    private static Integer currentLabel = 0;

    public void setJumpFlag() {
        this.jumpFlag = true;
    }
    public void unSetJumpFlag() {
        this.jumpFlag = false;
    }
    public void addInstruction(Instruction instruction) {
       instructions.add(instruction);
    }
    public void addVariable(String variable, Double value) {
        variables.put(variable, value);
    }
    public Double getVariable(String variable) {
        if (variables.containsKey(variable)) {
            return variables.get(variable);
        } else {
            return 0.0;
        }
    }
    public void printValues() {
        variables.values().forEach(System.out::println);
    }
    public void printLabels() {
        for (Instruction instruction : instructions) {
            System.out.println(instruction.getLabel());
        }
    }
    public void setProgramCounter(Integer label) {
        currentLabel = label;
    }

    // deprecated
    public void interpret() {
        for (Program instruction : instructions) {
           Value eval = new EvalVisitor().visit(instruction);
        }
    }

    public void run() {
        Collections.sort(instructions, Comparator.comparingInt(Instruction::getLabel));
        currentLabel = instructions.get(0).getLabel();
        Integer currentLabelIndex = 0;
        for (Instruction instruction : instructions) {
            indexToLabel.put(instruction.getLabel(), currentLabelIndex);
            currentLabelIndex++;
        }
        currentLabelIndex = 0;

        while (true) {
            try {
                instructions.get(currentLabelIndex).interpret();
            } catch (Exception e) {
                System.out.println(e.toString());
                if (this.getVariable("TRAP") == 0.0 || this.getVariable("TRAP") == null) {
                    System.exit(-1);
                } else {
                    currentLabel = Integer.valueOf(getVariable("TRAP").intValue());
                    setJumpFlag();
                    this.addVariable("TRAP", 0.0);
                }
            } if (!jumpFlag) {
                // no goto/trap in instruction
                currentLabelIndex++;
                if (!indexToLabel.containsValue(currentLabelIndex)) {
                    break;
                }
                currentLabel = instructions.get(currentLabelIndex).getLabel();
            } else {
                // goto/trap encountered
                unSetJumpFlag();
                try {
                    currentLabelIndex = indexToLabel.get(currentLabel);
                } catch (Exception e) {
                    System.out.println("ERROR: TRIED TO JUMP TO NONEXISTENT LABEL");
                    System.exit(-1);
                }
                }
        }


    }
}
