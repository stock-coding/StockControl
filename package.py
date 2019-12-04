import zipfile
import os

with zipfile.ZipFile("FileToSubmit.zip", "w") as package:
    for root, directory, files in os.walk("."):
        for filename in files:
            if filename.endswith(('.png', '.java', '.xlsx')):
                package.write(os.path.join(root, filename))

