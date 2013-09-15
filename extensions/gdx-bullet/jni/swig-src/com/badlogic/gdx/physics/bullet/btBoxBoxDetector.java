/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet;

import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;

public class btBoxBoxDetector extends BulletBase {
	private long swigCPtr;
	
	protected btBoxBoxDetector(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, cPtr, cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	protected btBoxBoxDetector(long cPtr, boolean cMemoryOwn) {
		this("btBoxBoxDetector", cPtr, cMemoryOwn);
		construct();
	}
	
	public static long getCPtr(btBoxBoxDetector obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	@Override
	protected void finalize() throws Throwable {
		if (!destroyed)
			destroy();
		super.finalize();
	}

  @Override protected synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				gdxBulletJNI.delete_btBoxBoxDetector(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public void setBox1(btBoxShape value) {
    gdxBulletJNI.btBoxBoxDetector_box1_set(swigCPtr, this, btBoxShape.getCPtr(value), value);
  }

  public btBoxShape getBox1() {
    long cPtr = gdxBulletJNI.btBoxBoxDetector_box1_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btBoxShape(cPtr, false);
  }

  public void setBox2(btBoxShape value) {
    gdxBulletJNI.btBoxBoxDetector_box2_set(swigCPtr, this, btBoxShape.getCPtr(value), value);
  }

  public btBoxShape getBox2() {
    long cPtr = gdxBulletJNI.btBoxBoxDetector_box2_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btBoxShape(cPtr, false);
  }

  public btBoxBoxDetector(btBoxShape box1, btBoxShape box2) {
    this(gdxBulletJNI.new_btBoxBoxDetector(btBoxShape.getCPtr(box1), box1, btBoxShape.getCPtr(box2), box2), true);
  }

  public void getClosestPoints(ClosestPointInput input, Result output, btIDebugDraw debugDraw, boolean swapResults) {
    gdxBulletJNI.btBoxBoxDetector_getClosestPoints__SWIG_0(swigCPtr, this, ClosestPointInput.getCPtr(input), input, Result.getCPtr(output), output, btIDebugDraw.getCPtr(debugDraw), debugDraw, swapResults);
  }

  public void getClosestPoints(ClosestPointInput input, Result output, btIDebugDraw debugDraw) {
    gdxBulletJNI.btBoxBoxDetector_getClosestPoints__SWIG_1(swigCPtr, this, ClosestPointInput.getCPtr(input), input, Result.getCPtr(output), output, btIDebugDraw.getCPtr(debugDraw), debugDraw);
  }

}
