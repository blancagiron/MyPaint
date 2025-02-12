# MyPaint
Custom Paint in Java (NetBeans + Ant) 🎨🖌️ made as A simple paint-like drawing application built with Java and Swing, using NetBeanst for project management and compilation. This project is the final assignment for the Multimedia Systems course and the result of weekly work throughout the semester.

## ✨ Features

- **Drawing Tools**:
  - Predefined shapes: Lines, Parallelograms, Pentagons, Curves, Curves with two points, Ellipses, Circles
  - Custom shape: **Ghost figure**
  - Freehand drawing

- **Text Addition**: Add and edit text on the canvas.

- **Selection Tool**: Select drawn shapes to edit their attributes:
  - Color selection
  - Fill or no fill
  - Smooth edges
  - Transparency level
  - Stroke thickness

- **Image Editing**:
  - Adjust **contrast** and **lighting**
  - Apply operations like **LookupOp** or **PosterizeOp**
  - Filters: **Gaussian blur**, **Relief**, **Sharpening**, **Comet filter** (simulating a comet trail), **Rotate**, **Tint with color**, and **Isolate a color** in the image.

- **More Options**: Additional features are available to enhance the drawing and image editing experience.
  
## 📥 Download  
1. Go to [Releases](https://github.com/blancagiron/MyPaint/releases) and download:  
   - `P13.jar`  
   - `lib/` folder  
   - `runMyPaint.sh` (Linux/macOS)
## ▶️ How to Run

On **Linux/macOS** (with runMyPaint.sh)

1. Make the script executable:
```
chmod +x runMyPaint.sh
```
2. Run the script by executing:
```
./runMyPaint.sh
```
On **Windows** (without a script)

1. Open Command Prompt (CMD) or PowerShell.
2. Navigate to the dist/ folder where the P13.jar file is located.
3.Run the following command:
```
java -cp "P13.jar;lib/*" p4.P4
```
