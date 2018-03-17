package com.example.hooch.ewalletapp;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;

import java.security.Permission;

import github.nisrulz.qreader.QRDataListener;
import github.nisrulz.qreader.QREader;


/**
 * A simple {@link Fragment} subclass.
 */
public class QRFragment extends Fragment {

    private SurfaceView cameraSurfaceView;
    private QREader qrEader;
    private boolean hasCameraPermission;


    public QRFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_qr, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        hasCameraPermission = PermissionUtil.checkPermissonGranted(getContext(), PermissionUtil.cameraPermission);
        cameraSurfaceView = view.findViewById(R.id.camera_surface_view);
        qrEader = new QREader.Builder(getContext(), cameraSurfaceView, new QRDataListener() {
            @Override
            public void onDetected(String data) {
                System.out.println(data);
            }
        }).enableAutofocus(true)
                .facing(QREader.BACK_CAM)
                .build();

        if (hasCameraPermission)
            qrEader.start();
        else
            PermissionUtil.requestPermission(getActivity(), PermissionUtil.cameraPermission, 100);
    }

    @Override
    public void onResume() {
        super.onResume();
        if (hasCameraPermission && qrEader != null)
            qrEader.initAndStart(cameraSurfaceView);
    }

    @Override
    public void onPause() {
        super.onPause();
        if (hasCameraPermission && qrEader != null)
            qrEader.releaseAndCleanup();
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        if (requestCode == 100) {
            PermissionUtil.onRequestPermissionsResult(grantResults, new PermissionCallback() {
                @Override
                public void onPermissionGranted() {
                    if ( PermissionUtil.checkPermissonGranted(getActivity(), PermissionUtil.cameraPermission)) {
                        System.out.println("OK");
                    }
                }

                @Override
                public void onPermissionDenied() {

                }
            });
        }
    }
}
