# coding: utf-8

from __future__ import absolute_import
import unittest

from flask import json
from six import BytesIO

from openapi_server.models.inline_response500 import InlineResponse500  # noqa: E501
from openapi_server.models.license_information import LicenseInformation  # noqa: E501
from openapi_server.models.unknownbasetype import UNKNOWN_BASE_TYPE  # noqa: E501
from openapi_server.test import BaseTestCase


class TestLicenseController(BaseTestCase):
    """LicenseController integration test stubs"""

    def test_license_activation(self):
        """Test case for license_activation

        Activate license
        """
        unknown_base_type = {activationKey=xxxx-xxxx-xxxx-xxxx-xxxx-xxxx-xxxx, quantity=1, comment=MetaDefender Core Server 001}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'apikey': 'apikey_example',
            'apikey': 'special-key',
        }
        response = self.client.open(
            '/admin/license/activation',
            method='POST',
            headers=headers,
            data=json.dumps(unknown_base_type),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_license_get(self):
        """Test case for license_get

        Get Current License Information
        """
        headers = { 
            'Accept': 'application/json',
            'apikey': 'apikey_example',
            'apikey': 'special-key',
        }
        response = self.client.open(
            '/admin/license',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("application/octet-stream not supported by Connexion")
    def test_license_upload(self):
        """Test case for license_upload

        Upload license key
        """
        body = 'body_example'
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/octet-stream',
            'apikey': 'apikey_example',
            'apikey': 'special-key',
        }
        response = self.client.open(
            '/admin/license',
            method='POST',
            headers=headers,
            data=json.dumps(body),
            content_type='application/octet-stream')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
