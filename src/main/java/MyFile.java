class MyFile
    {
        private String filename = null;

        public MyFile(String name)
        {
            this.filename = name;
        }

        public MyFile(String folder, String name)
        {
            this.filename = folder + name;
        }

        public MyFile(MyFile file, String name)
        {
            this.filename = file.getFolder() + name;
        }
    }
