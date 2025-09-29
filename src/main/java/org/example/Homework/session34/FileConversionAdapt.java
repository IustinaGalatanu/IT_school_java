package org.example.Homework.session34;

interface File {
    void conversion(String file,String type);
}

class Word {
    void convertToPdf(String file) {
        System.out.println(file + " converted to pdf");
    }
    void convertToText(String file) {
        System.out.println(file + " converted to text");
    }

}
class Pdf  {
    void convertToWord(String file) {
        System.out.println(file + " converted to word");
    }
    void convertToText(String file) {
        System.out.println(file + " converted to text");
    }

}

class Text  {
    void convertToPdf(String file) {
        System.out.println(file + " converted to pdf");
    }
    void convertToWord(String file) {
        System.out.println(file + " converted to word");
    }

}

    class WordAdapter implements File {
        Word word = new Word();

        @Override
        public void conversion(String file, String type) {
            switch (type) {
                case "Pdf": {
                    word.convertToPdf(file);
                    break;
                }
                case "Text": {
                   word.convertToText(file);
                    break;
                }
                default:
                    System.out.printf("Can not convert %s in %s type", file, type);
            }
        }
    }

    class TextAdapter implements File {
        Text text = new Text();

        @Override
        public void conversion(String file, String type) {
            switch (type) {
                case "Pdf": {
                  text.convertToPdf(file);
                    break;
                }
                case "Word": {
                   text.convertToWord(file);
                    break;
                }
                default:
                    System.out.printf("Can not convert %s in %s type", file, type);
            }
        }
    }

        class PdfAdapter implements File {
            Pdf pdf = new Pdf();

            @Override
            public void conversion(String file, String type) {
                switch (type) {
                    case "Text": {
                      pdf.convertToText(file);
                        break;
                    }
                    case "Word": {
                       pdf.convertToWord(file);
                        break;
                    }
                    default:
                        System.out.printf("Can not convert %s in %s type", file, type);
                }
            }
        }

public class FileConversionAdapt {
    public static void main(String[] args) {

        File file1 = new PdfAdapter();
        File file2 = new WordAdapter();
        File file3 = new TextAdapter();

        file1.conversion("NewFile.pdf","Text");
        file2.conversion("NewFile.docx","Text");
        file3.conversion("NewFile.txt","Text");

    }

}










